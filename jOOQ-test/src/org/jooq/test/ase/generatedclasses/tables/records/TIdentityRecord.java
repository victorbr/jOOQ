/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TIdentityRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.ase.generatedclasses.tables.records.TIdentityRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1623544462;

	/**
	 * The table column <code>dbo.t_identity.id</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.TIdentity.ID, value);
	}

	/**
	 * The table column <code>dbo.t_identity.id</code>
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.TIdentity.ID);
	}

	/**
	 * The table column <code>dbo.t_identity.val</code>
	 */
	public void setVal(java.lang.Integer value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.TIdentity.VAL, value);
	}

	/**
	 * The table column <code>dbo.t_identity.val</code>
	 */
	public java.lang.Integer getVal() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.TIdentity.VAL);
	}

	/**
	 * Create a detached TIdentityRecord
	 */
	public TIdentityRecord() {
		super(org.jooq.test.ase.generatedclasses.tables.TIdentity.T_IDENTITY);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.DSL.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.DSL.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.ase.generatedclasses.tables.TIdentity.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.ase.generatedclasses.tables.TIdentity.VAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getVal();
	}
}
