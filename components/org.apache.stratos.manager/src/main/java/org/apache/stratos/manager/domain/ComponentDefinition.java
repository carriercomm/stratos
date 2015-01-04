package org.apache.stratos.manager.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "components")
public class ComponentDefinition implements Serializable {

    private static final long serialVersionUID = -5932265453191494386L;

	private List<GroupDefinition> groups;
	private DependencyDefinitions dependencies;
    private List<CartridgeDefinition> cartridges;

    public List<GroupDefinition> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDefinition> groups) {
        this.groups = groups;
    }

	public DependencyDefinitions getDependencies() {
		return dependencies;
	}

	public void setDependencies(DependencyDefinitions dependencies) {
		this.dependencies = dependencies;
	}

	public List<CartridgeDefinition> getCartridges() {
		return cartridges;
	}

	public void setCartridges(List<CartridgeDefinition> cartridges) {
		this.cartridges = cartridges;
	}
}