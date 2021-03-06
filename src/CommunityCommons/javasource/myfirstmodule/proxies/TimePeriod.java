// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class TimePeriod
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject timePeriodMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.TimePeriod";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		StartDate("StartDate"),
		ComparisonDate("ComparisonDate"),
		YearsBetween("YearsBetween"),
		MonthsBetween("MonthsBetween");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TimePeriod(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.TimePeriod"));
	}

	protected TimePeriod(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject timePeriodMendixObject)
	{
		if (timePeriodMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.TimePeriod", timePeriodMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.TimePeriod");

		this.timePeriodMendixObject = timePeriodMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TimePeriod.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.TimePeriod initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.TimePeriod.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.TimePeriod initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.TimePeriod(context, mendixObject);
	}

	public static myfirstmodule.proxies.TimePeriod load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.TimePeriod.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of ComparisonDate
	 */
	public final java.util.Date getComparisonDate()
	{
		return getComparisonDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ComparisonDate
	 */
	public final java.util.Date getComparisonDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ComparisonDate.toString());
	}

	/**
	 * Set value of ComparisonDate
	 * @param comparisondate
	 */
	public final void setComparisonDate(java.util.Date comparisondate)
	{
		setComparisonDate(getContext(), comparisondate);
	}

	/**
	 * Set value of ComparisonDate
	 * @param context
	 * @param comparisondate
	 */
	public final void setComparisonDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date comparisondate)
	{
		getMendixObject().setValue(context, MemberNames.ComparisonDate.toString(), comparisondate);
	}

	/**
	 * @return value of YearsBetween
	 */
	public final java.lang.Integer getYearsBetween()
	{
		return getYearsBetween(getContext());
	}

	/**
	 * @param context
	 * @return value of YearsBetween
	 */
	public final java.lang.Integer getYearsBetween(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.YearsBetween.toString());
	}

	/**
	 * Set value of YearsBetween
	 * @param yearsbetween
	 */
	public final void setYearsBetween(java.lang.Integer yearsbetween)
	{
		setYearsBetween(getContext(), yearsbetween);
	}

	/**
	 * Set value of YearsBetween
	 * @param context
	 * @param yearsbetween
	 */
	public final void setYearsBetween(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer yearsbetween)
	{
		getMendixObject().setValue(context, MemberNames.YearsBetween.toString(), yearsbetween);
	}

	/**
	 * @return value of MonthsBetween
	 */
	public final java.lang.Integer getMonthsBetween()
	{
		return getMonthsBetween(getContext());
	}

	/**
	 * @param context
	 * @return value of MonthsBetween
	 */
	public final java.lang.Integer getMonthsBetween(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MonthsBetween.toString());
	}

	/**
	 * Set value of MonthsBetween
	 * @param monthsbetween
	 */
	public final void setMonthsBetween(java.lang.Integer monthsbetween)
	{
		setMonthsBetween(getContext(), monthsbetween);
	}

	/**
	 * Set value of MonthsBetween
	 * @param context
	 * @param monthsbetween
	 */
	public final void setMonthsBetween(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer monthsbetween)
	{
		getMendixObject().setValue(context, MemberNames.MonthsBetween.toString(), monthsbetween);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return timePeriodMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.TimePeriod that = (myfirstmodule.proxies.TimePeriod) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.TimePeriod";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
