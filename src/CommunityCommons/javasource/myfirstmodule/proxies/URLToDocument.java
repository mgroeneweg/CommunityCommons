// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class URLToDocument extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.URLToDocument";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		URL("URL"),
		FileName("FileName"),
		Result("Result"),
		FileSize("FileSize"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public URLToDocument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.URLToDocument"));
	}

	protected URLToDocument(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject uRLToDocumentMendixObject)
	{
		super(context, uRLToDocumentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.URLToDocument", uRLToDocumentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.URLToDocument");
	}

	/**
	 * @deprecated Use 'URLToDocument.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.URLToDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.URLToDocument.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.URLToDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.URLToDocument(context, mendixObject);
	}

	public static myfirstmodule.proxies.URLToDocument load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.URLToDocument.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.URLToDocument> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.URLToDocument> result = new java.util.ArrayList<myfirstmodule.proxies.URLToDocument>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.URLToDocument" + xpathConstraint))
			result.add(myfirstmodule.proxies.URLToDocument.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of URL
	 */
	public final java.lang.String getURL()
	{
		return getURL(getContext());
	}

	/**
	 * @param context
	 * @return value of URL
	 */
	public final java.lang.String getURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.URL.toString());
	}

	/**
	 * Set value of URL
	 * @param url
	 */
	public final void setURL(java.lang.String url)
	{
		setURL(getContext(), url);
	}

	/**
	 * Set value of URL
	 * @param context
	 * @param url
	 */
	public final void setURL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.URL.toString(), url);
	}

	/**
	 * @return value of FileName
	 */
	public final java.lang.String getFileName()
	{
		return getFileName(getContext());
	}

	/**
	 * @param context
	 * @return value of FileName
	 */
	public final java.lang.String getFileName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FileName.toString());
	}

	/**
	 * Set value of FileName
	 * @param filename
	 */
	public final void setFileName(java.lang.String filename)
	{
		setFileName(getContext(), filename);
	}

	/**
	 * Set value of FileName
	 * @param context
	 * @param filename
	 */
	public final void setFileName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String filename)
	{
		getMendixObject().setValue(context, MemberNames.FileName.toString(), filename);
	}

	/**
	 * @return value of Result
	 */
	public final java.lang.Boolean getResult()
	{
		return getResult(getContext());
	}

	/**
	 * @param context
	 * @return value of Result
	 */
	public final java.lang.Boolean getResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Result.toString());
	}

	/**
	 * Set value of Result
	 * @param result
	 */
	public final void setResult(java.lang.Boolean result)
	{
		setResult(getContext(), result);
	}

	/**
	 * Set value of Result
	 * @param context
	 * @param result
	 */
	public final void setResult(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean result)
	{
		getMendixObject().setValue(context, MemberNames.Result.toString(), result);
	}

	/**
	 * @return value of FileSize
	 */
	public final java.lang.Integer getFileSize()
	{
		return getFileSize(getContext());
	}

	/**
	 * @param context
	 * @return value of FileSize
	 */
	public final java.lang.Integer getFileSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.FileSize.toString());
	}

	/**
	 * Set value of FileSize
	 * @param filesize
	 */
	public final void setFileSize(java.lang.Integer filesize)
	{
		setFileSize(getContext(), filesize);
	}

	/**
	 * Set value of FileSize
	 * @param context
	 * @param filesize
	 */
	public final void setFileSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer filesize)
	{
		getMendixObject().setValue(context, MemberNames.FileSize.toString(), filesize);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.URLToDocument that = (myfirstmodule.proxies.URLToDocument) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.URLToDocument";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
