package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttributeMatcher;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassAttributeQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.IsEStringQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.context.EMFPatternMatcherContext;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate EClassWithEStringAttributeMatcher in a type-safe way.
 * 
 * @see EClassWithEStringAttributeMatcher
 * @see EClassWithEStringAttributeMatch
 * 
 */
@SuppressWarnings("all")
public final class EClassWithEStringAttributeQuerySpecification extends BaseGeneratedQuerySpecification<EClassWithEStringAttributeMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassWithEStringAttributeQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EClassWithEStringAttributeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EClassWithEStringAttributeMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("E","Attr");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("E", "org.eclipse.emf.ecore.EClass"),new PParameter("Attr", "org.eclipse.emf.ecore.EAttribute"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_E = body.getOrCreateVariableByName("E");
      PVariable var_Attr = body.getOrCreateVariableByName("Attr");
      PVariable var_Type = body.getOrCreateVariableByName("Type");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_E, "E"), 
        new ExportedParameter(body, var_Attr, "Attr")
      ));
      
      
      new TypeUnary(body, var_E, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass"), "http://www.eclipse.org/emf/2002/Ecore/EClass");
      new PositivePatternCall(body, new FlatTuple(var_E, var_Attr, var_Type), EClassAttributeQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_Type), IsEStringQuerySpecification.instance());
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private EClassWithEStringAttributeQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<EClassWithEStringAttributeQuerySpecification> {
    @Override
    public EClassWithEStringAttributeQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static EClassWithEStringAttributeQuerySpecification INSTANCE = make();
    
    public static EClassWithEStringAttributeQuerySpecification make() {
      try {
      	return new EClassWithEStringAttributeQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
