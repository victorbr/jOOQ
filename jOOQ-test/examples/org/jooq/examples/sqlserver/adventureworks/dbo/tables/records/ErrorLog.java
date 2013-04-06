/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "ErrorLog", schema = "dbo")
public class ErrorLog extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog> implements org.jooq.Record9<java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -2079155615;

	/**
	 * Setter for <code>dbo.ErrorLog.ErrorLogID</code>. 
	 */
	public void setErrorLogID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorLogID, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.ErrorLogID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ErrorLogID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getErrorLogID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorLogID);
	}

	/**
	 * Setter for <code>dbo.ErrorLog.ErrorTime</code>. 
	 */
	public void setErrorTime(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorTime, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.ErrorTime</code>. 
	 */
	@javax.persistence.Column(name = "ErrorTime", nullable = false)
	public java.sql.Timestamp getErrorTime() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorTime);
	}

	/**
	 * Setter for <code>dbo.ErrorLog.UserName</code>. 
	 */
	public void setUserName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.UserName, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.UserName</code>. 
	 */
	@javax.persistence.Column(name = "UserName", nullable = false, length = 128)
	public java.lang.String getUserName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.UserName);
	}

	/**
	 * Setter for <code>dbo.ErrorLog.ErrorNumber</code>. 
	 */
	public void setErrorNumber(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorNumber, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.ErrorNumber</code>. 
	 */
	@javax.persistence.Column(name = "ErrorNumber", nullable = false, precision = 10)
	public java.lang.Integer getErrorNumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorNumber);
	}

	/**
	 * Setter for <code>dbo.ErrorLog.ErrorSeverity</code>. 
	 */
	public void setErrorSeverity(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorSeverity, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.ErrorSeverity</code>. 
	 */
	@javax.persistence.Column(name = "ErrorSeverity", precision = 10)
	public java.lang.Integer getErrorSeverity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorSeverity);
	}

	/**
	 * Setter for <code>dbo.ErrorLog.ErrorState</code>. 
	 */
	public void setErrorState(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorState, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.ErrorState</code>. 
	 */
	@javax.persistence.Column(name = "ErrorState", precision = 10)
	public java.lang.Integer getErrorState() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorState);
	}

	/**
	 * Setter for <code>dbo.ErrorLog.ErrorProcedure</code>. 
	 */
	public void setErrorProcedure(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorProcedure, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.ErrorProcedure</code>. 
	 */
	@javax.persistence.Column(name = "ErrorProcedure", length = 126)
	public java.lang.String getErrorProcedure() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorProcedure);
	}

	/**
	 * Setter for <code>dbo.ErrorLog.ErrorLine</code>. 
	 */
	public void setErrorLine(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorLine, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.ErrorLine</code>. 
	 */
	@javax.persistence.Column(name = "ErrorLine", precision = 10)
	public java.lang.Integer getErrorLine() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorLine);
	}

	/**
	 * Setter for <code>dbo.ErrorLog.ErrorMessage</code>. 
	 */
	public void setErrorMessage(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorMessage, value);
	}

	/**
	 * Getter for <code>dbo.ErrorLog.ErrorMessage</code>. 
	 */
	@javax.persistence.Column(name = "ErrorMessage", nullable = false, length = 4000)
	public java.lang.String getErrorMessage() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorMessage);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.DSL.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.DSL.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorLogID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.UserName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorNumber;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorSeverity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorState;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorProcedure;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorLine;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorMessage;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getErrorLogID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getErrorTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUserName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getErrorNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getErrorSeverity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getErrorState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getErrorProcedure();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getErrorLine();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getErrorMessage();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ErrorLog
	 */
	public ErrorLog() {
		super(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog);
	}
}
