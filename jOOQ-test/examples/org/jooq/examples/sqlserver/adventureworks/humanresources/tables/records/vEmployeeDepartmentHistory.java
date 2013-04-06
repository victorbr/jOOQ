/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "vEmployeeDepartmentHistory", schema = "HumanResources")
public class vEmployeeDepartmentHistory extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartmentHistory> implements org.jooq.Record11<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 1447294483;

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.EmployeeID</code>. 
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.EmployeeID, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.EmployeeID</code>. 
	 */
	@javax.persistence.Column(name = "EmployeeID", nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.EmployeeID);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.Title</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Title, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.Title</code>. 
	 */
	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Title);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.FirstName</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.FirstName, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.FirstName</code>. 
	 */
	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.FirstName);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.MiddleName</code>. 
	 */
	public void setMiddleName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.MiddleName, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.MiddleName</code>. 
	 */
	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.MiddleName);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.LastName</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.LastName, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.LastName</code>. 
	 */
	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.LastName);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.Suffix</code>. 
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Suffix, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.Suffix</code>. 
	 */
	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Suffix);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.Shift</code>. 
	 */
	public void setShift(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Shift, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.Shift</code>. 
	 */
	@javax.persistence.Column(name = "Shift", nullable = false, length = 50)
	public java.lang.String getShift() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Shift);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.Department</code>. 
	 */
	public void setDepartment(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Department, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.Department</code>. 
	 */
	@javax.persistence.Column(name = "Department", nullable = false, length = 50)
	public java.lang.String getDepartment() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Department);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.GroupName</code>. 
	 */
	public void setGroupName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.GroupName, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.GroupName</code>. 
	 */
	@javax.persistence.Column(name = "GroupName", nullable = false, length = 50)
	public java.lang.String getGroupName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.GroupName);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.StartDate</code>. 
	 */
	public void setStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.StartDate, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.StartDate</code>. 
	 */
	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.StartDate);
	}

	/**
	 * Setter for <code>HumanResources.vEmployeeDepartmentHistory.EndDate</code>. 
	 */
	public void setEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.EndDate, value);
	}

	/**
	 * Getter for <code>HumanResources.vEmployeeDepartmentHistory.EndDate</code>. 
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.EndDate);
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.DSL.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10(), field11());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.DSL.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9(), value10(), value11());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.EmployeeID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Title;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.FirstName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.MiddleName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.LastName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Suffix;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Shift;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.Department;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.GroupName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.StartDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory.EndDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getEmployeeID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getMiddleName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getSuffix();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getShift();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getDepartment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getGroupName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getStartDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getEndDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached vEmployeeDepartmentHistory
	 */
	public vEmployeeDepartmentHistory() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory);
	}
}
