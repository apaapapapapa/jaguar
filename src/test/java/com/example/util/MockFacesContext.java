package com.example.util;

import java.util.Iterator;

import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import jakarta.faces.application.Application;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.application.FacesMessage.Severity;
import jakarta.faces.component.UIViewRoot;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseStream;
import jakarta.faces.context.ResponseWriter;
import jakarta.faces.lifecycle.Lifecycle;
import jakarta.faces.render.RenderKit;

public class MockFacesContext extends FacesContext {

    private ExternalContext externalContext;

    public MockFacesContext() {
        externalContext = Mockito.mock(ExternalContext.class);
    }

    public static FacesContext mockFacesContext() {
        MockFacesContext context = new MockFacesContext();
        setCurrentInstance(context);
        return context;
    }

    @Override
    public Application getApplication() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getApplication'");
    }

    @Override
    public Iterator<String> getClientIdsWithMessages() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClientIdsWithMessages'");
    }

    @Override
    public Lifecycle getLifecycle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLifecycle'");
    }

    @Override
    public ExternalContext getExternalContext() {
        return externalContext;
    }

    @Override
    public Severity getMaximumSeverity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaximumSeverity'");
    }

    @Override
    public Iterator<FacesMessage> getMessages() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMessages'");
    }

    @Override
    public Iterator<FacesMessage> getMessages(String clientId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMessages'");
    }

    @Override
    public RenderKit getRenderKit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRenderKit'");
    }

    @Override
    public boolean getRenderResponse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRenderResponse'");
    }

    @Override
    public boolean getResponseComplete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResponseComplete'");
    }

    @Override
    public ResponseStream getResponseStream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResponseStream'");
    }

    @Override
    public void setResponseStream(ResponseStream responseStream) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setResponseStream'");
    }

    @Override
    public ResponseWriter getResponseWriter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResponseWriter'");
    }

    @Override
    public void setResponseWriter(ResponseWriter responseWriter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setResponseWriter'");
    }

    @Override
    public UIViewRoot getViewRoot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getViewRoot'");
    }

    @Override
    public void setViewRoot(UIViewRoot root) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setViewRoot'");
    }

    @Override
    public void addMessage(String clientId, FacesMessage message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMessage'");
    }

    @Override
    public void release() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'release'");
    }

    @Override
    public void renderResponse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renderResponse'");
    }

    @Override
    public void responseComplete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'responseComplete'");
    }
}
