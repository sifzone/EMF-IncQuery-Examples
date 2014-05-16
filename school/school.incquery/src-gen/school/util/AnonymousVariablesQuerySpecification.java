package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.AnonymousVariablesMatcher;
import school.util.TeachersSchoolWithNameQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate AnonymousVariablesMatcher in a type-safe way.
 * 
 * @see AnonymousVariablesMatcher
 * @see AnonymousVariablesMatch
 * 
 */
@SuppressWarnings("all")
public final class AnonymousVariablesQuerySpecification extends BaseGeneratedQuerySpecification<AnonymousVariablesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AnonymousVariablesQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected AnonymousVariablesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AnonymousVariablesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.anonymousVariables";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("teacher");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("teacher", "school.Teacher"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_teacher = body.getOrCreateVariableByName("teacher");
      PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_teacher, "teacher")
      ));
      
      new PositivePatternCall(body, new FlatTuple(var_teacher, var___0_, var___1_), TeachersSchoolWithNameQuerySpecification.instance());
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static AnonymousVariablesQuerySpecification INSTANCE = make();
    
    public static AnonymousVariablesQuerySpecification make() {
      return new AnonymousVariablesQuerySpecification();					
      
    }
  }
  
}
