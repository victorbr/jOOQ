/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "CreditCard", schema = "Sales")
public class CreditCard extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Short, java.sql.Timestamp> {

	private static final long serialVersionUID = 587691915;

	/**
	 * Setter for <code>Sales.CreditCard.CreditCardID</code>. 
	 */
	public void setCreditCardID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CreditCardID, value);
	}

	/**
	 * Getter for <code>Sales.CreditCard.CreditCardID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "CreditCardID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getCreditCardID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CreditCardID);
	}

	/**
	 * Setter for <code>Sales.CreditCard.CardType</code>. 
	 */
	public void setCardType(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CardType, value);
	}

	/**
	 * Getter for <code>Sales.CreditCard.CardType</code>. 
	 */
	@javax.persistence.Column(name = "CardType", nullable = false, length = 50)
	public java.lang.String getCardType() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CardType);
	}

	/**
	 * Setter for <code>Sales.CreditCard.CardNumber</code>. 
	 */
	public void setCardNumber(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CardNumber, value);
	}

	/**
	 * Getter for <code>Sales.CreditCard.CardNumber</code>. 
	 */
	@javax.persistence.Column(name = "CardNumber", nullable = false, length = 25)
	public java.lang.String getCardNumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CardNumber);
	}

	/**
	 * Setter for <code>Sales.CreditCard.ExpMonth</code>. 
	 */
	public void setExpMonth(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ExpMonth, value);
	}

	/**
	 * Getter for <code>Sales.CreditCard.ExpMonth</code>. 
	 */
	@javax.persistence.Column(name = "ExpMonth", nullable = false, precision = 3)
	public java.lang.Byte getExpMonth() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ExpMonth);
	}

	/**
	 * Setter for <code>Sales.CreditCard.ExpYear</code>. 
	 */
	public void setExpYear(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ExpYear, value);
	}

	/**
	 * Getter for <code>Sales.CreditCard.ExpYear</code>. 
	 */
	@javax.persistence.Column(name = "ExpYear", nullable = false, precision = 5)
	public java.lang.Short getExpYear() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ExpYear);
	}

	/**
	 * Setter for <code>Sales.CreditCard.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Sales.CreditCard.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Short, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.DSL.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Short, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.DSL.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CreditCardID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CardType;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CardNumber;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field4() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ExpMonth;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field5() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ExpYear;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getCreditCardID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCardType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getCardNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value4() {
		return getExpMonth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value5() {
		return getExpYear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CreditCard
	 */
	public CreditCard() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard);
	}
}
