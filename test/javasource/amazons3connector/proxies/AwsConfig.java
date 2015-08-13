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
 * The credentials for connection to S3
 */
public class AwsConfig
{
	private final IMendixObject awsConfigMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "AmazonS3Connector.AwsConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AccessKey("AccessKey"),
		SecretKey("SecretKey");

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

	public AwsConfig(IContext context)
	{
		this(context, Core.instantiate(context, "AmazonS3Connector.AwsConfig"));
	}

	protected AwsConfig(IContext context, IMendixObject awsConfigMendixObject)
	{
		if (awsConfigMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("AmazonS3Connector.AwsConfig", awsConfigMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a AmazonS3Connector.AwsConfig");

		this.awsConfigMendixObject = awsConfigMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AwsConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static amazons3connector.proxies.AwsConfig initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return amazons3connector.proxies.AwsConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static amazons3connector.proxies.AwsConfig initialize(IContext context, IMendixObject mendixObject)
	{
		return new amazons3connector.proxies.AwsConfig(context, mendixObject);
	}

	public static amazons3connector.proxies.AwsConfig load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return amazons3connector.proxies.AwsConfig.initialize(context, mendixObject);
	}

	public static java.util.List<amazons3connector.proxies.AwsConfig> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<amazons3connector.proxies.AwsConfig> result = new java.util.ArrayList<amazons3connector.proxies.AwsConfig>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//AmazonS3Connector.AwsConfig" + xpathConstraint))
			result.add(amazons3connector.proxies.AwsConfig.initialize(context, obj));
		return result;
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
	 * @return value of AccessKey
	 */
	public final String getAccessKey()
	{
		return getAccessKey(getContext());
	}

	/**
	 * @param context
	 * @return value of AccessKey
	 */
	public final String getAccessKey(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.AccessKey.toString());
	}

	/**
	 * Set value of AccessKey
	 * @param accesskey
	 */
	public final void setAccessKey(String accesskey)
	{
		setAccessKey(getContext(), accesskey);
	}

	/**
	 * Set value of AccessKey
	 * @param context
	 * @param accesskey
	 */
	public final void setAccessKey(IContext context, String accesskey)
	{
		getMendixObject().setValue(context, MemberNames.AccessKey.toString(), accesskey);
	}

	/**
	 * @return value of SecretKey
	 */
	public final String getSecretKey()
	{
		return getSecretKey(getContext());
	}

	/**
	 * @param context
	 * @return value of SecretKey
	 */
	public final String getSecretKey(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SecretKey.toString());
	}

	/**
	 * Set value of SecretKey
	 * @param secretkey
	 */
	public final void setSecretKey(String secretkey)
	{
		setSecretKey(getContext(), secretkey);
	}

	/**
	 * Set value of SecretKey
	 * @param context
	 * @param secretkey
	 */
	public final void setSecretKey(IContext context, String secretkey)
	{
		getMendixObject().setValue(context, MemberNames.SecretKey.toString(), secretkey);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return awsConfigMendixObject;
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
			final amazons3connector.proxies.AwsConfig that = (amazons3connector.proxies.AwsConfig) obj;
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
		return "AmazonS3Connector.AwsConfig";
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
