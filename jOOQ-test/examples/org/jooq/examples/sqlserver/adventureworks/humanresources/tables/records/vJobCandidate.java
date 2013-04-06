/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "vJobCandidate", schema = "HumanResources")
public class vJobCandidate extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vJobCandidate> implements org.jooq.Record16<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -2023754967;

	/**
	 * Setter for <code>HumanResources.vJobCandidate.JobCandidateID</code>. 
	 */
	public void setJobCandidateID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.JobCandidateID, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.JobCandidateID</code>. 
	 */
	@javax.persistence.Column(name = "JobCandidateID", nullable = false, precision = 10)
	public java.lang.Integer getJobCandidateID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.JobCandidateID);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.EmployeeID</code>. 
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.EmployeeID, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.EmployeeID</code>. 
	 */
	@javax.persistence.Column(name = "EmployeeID", precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.EmployeeID);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Name.Prefix</code>. 
	 */
	public void setName_Prefix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Prefix, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Name.Prefix</code>. 
	 */
	@javax.persistence.Column(name = "Name.Prefix", length = 30)
	public java.lang.String getName_Prefix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Prefix);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Name.First</code>. 
	 */
	public void setName_First(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_First, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Name.First</code>. 
	 */
	@javax.persistence.Column(name = "Name.First", length = 30)
	public java.lang.String getName_First() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_First);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Name.Middle</code>. 
	 */
	public void setName_Middle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Middle, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Name.Middle</code>. 
	 */
	@javax.persistence.Column(name = "Name.Middle", length = 30)
	public java.lang.String getName_Middle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Middle);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Name.Last</code>. 
	 */
	public void setName_Last(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Last, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Name.Last</code>. 
	 */
	@javax.persistence.Column(name = "Name.Last", length = 30)
	public java.lang.String getName_Last() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Last);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Name.Suffix</code>. 
	 */
	public void setName_Suffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Suffix, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Name.Suffix</code>. 
	 */
	@javax.persistence.Column(name = "Name.Suffix", length = 30)
	public java.lang.String getName_Suffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Suffix);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Skills</code>. 
	 */
	public void setSkills(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Skills, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Skills</code>. 
	 */
	@javax.persistence.Column(name = "Skills")
	public java.lang.String getSkills() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Skills);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Addr.Type</code>. 
	 */
	public void setAddr_Type(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Type, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Addr.Type</code>. 
	 */
	@javax.persistence.Column(name = "Addr.Type", length = 30)
	public java.lang.String getAddr_Type() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Type);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Addr.Loc.CountryRegion</code>. 
	 */
	public void setAddr_Loc_CountryRegion(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_CountryRegion, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Addr.Loc.CountryRegion</code>. 
	 */
	@javax.persistence.Column(name = "Addr.Loc.CountryRegion", length = 100)
	public java.lang.String getAddr_Loc_CountryRegion() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_CountryRegion);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Addr.Loc.State</code>. 
	 */
	public void setAddr_Loc_State(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_State, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Addr.Loc.State</code>. 
	 */
	@javax.persistence.Column(name = "Addr.Loc.State", length = 100)
	public java.lang.String getAddr_Loc_State() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_State);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Addr.Loc.City</code>. 
	 */
	public void setAddr_Loc_City(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_City, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Addr.Loc.City</code>. 
	 */
	@javax.persistence.Column(name = "Addr.Loc.City", length = 100)
	public java.lang.String getAddr_Loc_City() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_City);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.Addr.PostalCode</code>. 
	 */
	public void setAddr_PostalCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_PostalCode, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.Addr.PostalCode</code>. 
	 */
	@javax.persistence.Column(name = "Addr.PostalCode", length = 20)
	public java.lang.String getAddr_PostalCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_PostalCode);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.EMail</code>. 
	 */
	public void setEMail(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.EMail, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.EMail</code>. 
	 */
	@javax.persistence.Column(name = "EMail")
	public java.lang.String getEMail() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.EMail);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.WebSite</code>. 
	 */
	public void setWebSite(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.WebSite, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.WebSite</code>. 
	 */
	@javax.persistence.Column(name = "WebSite")
	public java.lang.String getWebSite() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.WebSite);
	}

	/**
	 * Setter for <code>HumanResources.vJobCandidate.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.ModifiedDate, value);
	}

	/**
	 * Getter for <code>HumanResources.vJobCandidate.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.DSL.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10(), field11(), field12(), field13(), field14(), field15(), field16());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.DSL.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9(), value10(), value11(), value12(), value13(), value14(), value15(), value16());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.JobCandidateID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.EmployeeID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Prefix;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_First;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Middle;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Last;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Name_Suffix;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Skills;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Type;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_CountryRegion;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_State;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_Loc_City;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.Addr_PostalCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.EMail;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.WebSite;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field16() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getJobCandidateID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getEmployeeID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName_Prefix();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName_First();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getName_Middle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getName_Last();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getName_Suffix();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getSkills();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getAddr_Type();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getAddr_Loc_CountryRegion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getAddr_Loc_State();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getAddr_Loc_City();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getAddr_PostalCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getEMail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getWebSite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value16() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached vJobCandidate
	 */
	public vJobCandidate() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate);
	}
}
