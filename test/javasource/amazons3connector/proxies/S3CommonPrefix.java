// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package amazons3connector.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class S3CommonPrefix
{
	private final IMendixObject s3CommonPrefixMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "AmazonS3Connector.S3CommonPrefix";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Prefix("Prefix"),
		FolderName("FolderName"),
		ParentPrefix("ParentPrefix"),
		ParentFolderName("ParentFolderName"),
		S3CommonPrefix_S3Bucket("AmazonS3Connector.S3CommonPrefix_S3Bucket"),
		CurrentPrefix("AmazonS3Connector.CurrentPrefix");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public S3CommonPrefix(IContext context)
	{
		this(context, Core.instantiate(context, "AmazonS3Connector.S3CommonPrefix"));
	}

	protected S3CommonPrefix(IContext context, IMendixObject s3CommonPrefixMendixObject)
	{
		if (s3CommonPrefixMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("AmazonS3Connector.S3CommonPrefix", s3CommonPrefixMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a AmazonS3Connector.S3CommonPrefix");

		this.s3CommonPrefixMendixObject = s3CommonPrefixMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'S3CommonPrefix.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static amazons3connector.proxies.S3CommonPrefix initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return amazons3connector.proxies.S3CommonPrefix.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static amazons3connector.proxies.S3CommonPrefix initialize(IContext context, IMendixObject mendixObject)
	{
		return new amazons3connector.proxies.S3CommonPrefix(context, mendixObject);
	}

	public static amazons3connector.proxies.S3CommonPrefix load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return amazons3connector.proxies.S3CommonPrefix.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Prefix
	 */
	public final String getPrefix()
	{
		return getPrefix(getContext());
	}

	/**
	 * @param context
	 * @return value of Prefix
	 */
	public final String getPrefix(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Prefix.toString());
	}

	/**
	 * Set value of Prefix
	 * @param prefix
	 */
	public final void setPrefix(String prefix)
	{
		setPrefix(getContext(), prefix);
	}

	/**
	 * Set value of Prefix
	 * @param context
	 * @param prefix
	 */
	public final void setPrefix(IContext context, String prefix)
	{
		getMendixObject().setValue(context, MemberNames.Prefix.toString(), prefix);
	}

	/**
	 * @return value of FolderName
	 */
	public final String getFolderName()
	{
		return getFolderName(getContext());
	}

	/**
	 * @param context
	 * @return value of FolderName
	 */
	public final String getFolderName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FolderName.toString());
	}

	/**
	 * Set value of FolderName
	 * @param foldername
	 */
	public final void setFolderName(String foldername)
	{
		setFolderName(getContext(), foldername);
	}

	/**
	 * Set value of FolderName
	 * @param context
	 * @param foldername
	 */
	public final void setFolderName(IContext context, String foldername)
	{
		getMendixObject().setValue(context, MemberNames.FolderName.toString(), foldername);
	}

	/**
	 * @return value of ParentPrefix
	 */
	public final String getParentPrefix()
	{
		return getParentPrefix(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentPrefix
	 */
	public final String getParentPrefix(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ParentPrefix.toString());
	}

	/**
	 * Set value of ParentPrefix
	 * @param parentprefix
	 */
	public final void setParentPrefix(String parentprefix)
	{
		setParentPrefix(getContext(), parentprefix);
	}

	/**
	 * Set value of ParentPrefix
	 * @param context
	 * @param parentprefix
	 */
	public final void setParentPrefix(IContext context, String parentprefix)
	{
		getMendixObject().setValue(context, MemberNames.ParentPrefix.toString(), parentprefix);
	}

	/**
	 * @return value of ParentFolderName
	 */
	public final String getParentFolderName()
	{
		return getParentFolderName(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentFolderName
	 */
	public final String getParentFolderName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ParentFolderName.toString());
	}

	/**
	 * Set value of ParentFolderName
	 * @param parentfoldername
	 */
	public final void setParentFolderName(String parentfoldername)
	{
		setParentFolderName(getContext(), parentfoldername);
	}

	/**
	 * Set value of ParentFolderName
	 * @param context
	 * @param parentfoldername
	 */
	public final void setParentFolderName(IContext context, String parentfoldername)
	{
		getMendixObject().setValue(context, MemberNames.ParentFolderName.toString(), parentfoldername);
	}

	/**
	 * @return value of S3CommonPrefix_S3Bucket
	 */
	public final amazons3connector.proxies.S3Bucket getS3CommonPrefix_S3Bucket() throws CoreException
	{
		return getS3CommonPrefix_S3Bucket(getContext());
	}

	/**
	 * @param context
	 * @return value of S3CommonPrefix_S3Bucket
	 */
	public final amazons3connector.proxies.S3Bucket getS3CommonPrefix_S3Bucket(IContext context) throws CoreException
	{
		amazons3connector.proxies.S3Bucket result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.S3CommonPrefix_S3Bucket.toString());
		if (identifier != null)
			result = amazons3connector.proxies.S3Bucket.load(context, identifier);
		return result;
	}

	/**
	 * Set value of S3CommonPrefix_S3Bucket
	 * @param s3commonprefix_s3bucket
	 */
	public final void setS3CommonPrefix_S3Bucket(amazons3connector.proxies.S3Bucket s3commonprefix_s3bucket)
	{
		setS3CommonPrefix_S3Bucket(getContext(), s3commonprefix_s3bucket);
	}

	/**
	 * Set value of S3CommonPrefix_S3Bucket
	 * @param context
	 * @param s3commonprefix_s3bucket
	 */
	public final void setS3CommonPrefix_S3Bucket(IContext context, amazons3connector.proxies.S3Bucket s3commonprefix_s3bucket)
	{
		if (s3commonprefix_s3bucket == null)
			getMendixObject().setValue(context, MemberNames.S3CommonPrefix_S3Bucket.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.S3CommonPrefix_S3Bucket.toString(), s3commonprefix_s3bucket.getMendixObject().getId());
	}

	/**
	 * @return value of CurrentPrefix
	 */
	public final amazons3connector.proxies.S3Bucket getCurrentPrefix() throws CoreException
	{
		return getCurrentPrefix(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentPrefix
	 */
	public final amazons3connector.proxies.S3Bucket getCurrentPrefix(IContext context) throws CoreException
	{
		amazons3connector.proxies.S3Bucket result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CurrentPrefix.toString());
		if (identifier != null)
			result = amazons3connector.proxies.S3Bucket.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CurrentPrefix
	 * @param currentprefix
	 */
	public final void setCurrentPrefix(amazons3connector.proxies.S3Bucket currentprefix)
	{
		setCurrentPrefix(getContext(), currentprefix);
	}

	/**
	 * Set value of CurrentPrefix
	 * @param context
	 * @param currentprefix
	 */
	public final void setCurrentPrefix(IContext context, amazons3connector.proxies.S3Bucket currentprefix)
	{
		if (currentprefix == null)
			getMendixObject().setValue(context, MemberNames.CurrentPrefix.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CurrentPrefix.toString(), currentprefix.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return s3CommonPrefixMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final amazons3connector.proxies.S3CommonPrefix that = (amazons3connector.proxies.S3CommonPrefix) obj;
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
	public static String getType()
	{
		return "AmazonS3Connector.S3CommonPrefix";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
