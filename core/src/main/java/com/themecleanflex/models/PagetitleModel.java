package com.themecleanflex.models;

import static com.peregrine.commons.util.PerConstants.JCR_CONTENT;
import static com.peregrine.commons.util.PerConstants.JCR_PRIMARY_TYPE;
import static com.peregrine.commons.util.PerConstants.JCR_TITLE;
import static com.peregrine.commons.util.PerConstants.PAGE_PRIMARY_TYPE;

import com.peregrine.nodetypes.models.IComponent;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Pagetitle": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "element": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Choose Element Type",
          "x-form-type": "materialselect",
          "x-default": "p",
          "properties": {
            "h1": {
              "x-form-name": "h1",
              "x-form-value": "h1"
            },
            "h2": {
              "x-form-name": "h2",
              "x-form-value": "h2"
            },
            "h3": {
              "x-form-name": "h3",
              "x-form-value": "h3"
            },
            "h4": {
              "x-form-name": "h4",
              "x-form-value": "h4"
            },
            "h5": {
              "x-form-name": "h5",
              "x-form-value": "h5"
            },
            "p": {
              "x-form-name": "p",
              "x-form-value": "p"
            }
          }
        },
        "bgref": {
          "x-form-type": "reference",
          "type": "object",
          "x-type": "component",
          "properties": {
            "anchorname": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Anchor Name",
              "x-form-type": "text"
            },
            "extraclasses": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Additonal Classes",
              "x-form-type": "text"
            },
            "htmlelement": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Semantic Element",
              "x-form-type": "materialselect",
              "x-default": "section",
              "properties": {
                "section": {
                  "x-form-name": "section",
                  "x-form-value": "section"
                },
                "article": {
                  "x-form-name": "article",
                  "x-form-value": "article"
                },
                "main": {
                  "x-form-name": "main",
                  "x-form-value": "main"
                },
                "div": {
                  "x-form-name": "div",
                  "x-form-value": "div"
                },
                "header": {
                  "x-form-name": "header",
                  "x-form-value": "header"
                },
                "nav": {
                  "x-form-name": "nav",
                  "x-form-value": "nav"
                },
                "footer": {
                  "x-form-name": "footer",
                  "x-form-value": "footer"
                }
              }
            },
            "colorscheme": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Block Color Scheme",
              "x-form-type": "materialradio",
              "x-default": "",
              "properties": {
                "none": {
                  "x-form-name": "None",
                  "x-form-value": ""
                },
                "light": {
                  "x-form-name": "Light",
                  "x-form-value": "light"
                },
                "dark": {
                  "x-form-name": "Dark",
                  "x-form-value": "dark"
                }
              }
            },
            "custombackground": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Custom Background",
              "x-form-type": "materialswitch",
              "x-default": "false"
            },
            "backgroundtype": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Background Type",
              "x-form-type": "materialradio",
              "x-form-visible": "model.custombackground == 'true'",
              "properties": {
                "color": {
                  "x-form-name": "Color",
                  "x-form-value": "color"
                },
                "gradient": {
                  "x-form-name": "Gradient",
                  "x-form-value": "gradient"
                },
                "image": {
                  "x-form-name": "Image",
                  "x-form-value": "image"
                },
                "video": {
                  "x-form-name": "Video",
                  "x-form-value": "video"
                }
              }
            },
            "bgvideo": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Background Video",
              "x-form-type": "pathbrowser",
              "x-form-visible": "model.backgroundtype == 'video' and model.custombackground == 'true'",
              "x-default": "https://www.youtube.com/embed/Ju86mknumYM",
              "x-form-browserRoot": "/content/themecleanflex/assets"
            },
            "bgimage": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Background Image",
              "x-form-type": "pathbrowser",
              "x-form-visible": "model.backgroundtype == 'image' and model.custombackground == 'true'",
              "x-form-browserRoot": "/content/themecleanflex/assets"
            },
            "bgxposition": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Background X Position",
              "x-form-type": "materialrange",
              "x-form-min": 0,
              "x-form-max": 100,
              "x-form-visible": "model.backgroundtype == 'image' and model.custombackground == 'true'",
              "x-default": "50"
            },
            "bgyposition": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Background Y Position",
              "x-form-type": "materialrange",
              "x-form-min": 0,
              "x-form-max": 100,
              "x-form-visible": "model.backgroundtype == 'image' and model.custombackground == 'true'",
              "x-default": "50"
            },
            "bgsize": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Background Size Style",
              "x-form-type": "text",
              "x-default": "cover"
            },
            "overlay": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Overlay",
              "x-form-type": "materialswitch",
              "x-form-visible": "model.backgroundtype == 'image' and model.custombackground == 'true'"
            },
            "overlaycolor": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Overlay Color",
              "x-form-type": "color",
              "x-form-visible": "model.overlay == 'true' and model.backgroundtype == 'image' and model.custombackground == 'true'",
              "x-default": "#ffffff"
            },
            "overlayopacity": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Overlay opacity",
              "x-form-type": "materialrange",
              "x-form-min": 0,
              "x-form-max": 100,
              "x-form-visible": "model.overlay == 'true' and model.backgroundtype == 'image' and model.custombackground == 'true'",
              "x-default": "50"
            },
            "bgcolor": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Background Color",
              "x-form-type": "color",
              "x-form-visible": "(model.backgroundtype == 'color' or model.backgroundtype == 'gradient') and model.custombackground == 'true'",
              "x-default": "#ffffff"
            },
            "color2": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Color 2",
              "x-form-type": "color",
              "x-form-visible": "model.backgroundtype == 'gradient' and model.custombackground == 'true'",
              "x-default": "#c0c0c0"
            },
            "blockwidth": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Block Width",
              "x-form-type": "materialradio",
              "x-default": "default",
              "properties": {
                "default": {
                  "x-form-name": "Default",
                  "x-form-value": "default"
                },
                "full": {
                  "x-form-name": "Full Width",
                  "x-form-value": "full"
                },
                "article": {
                  "x-form-name": "Article Width",
                  "x-form-value": "article"
                }
              }
            },
            "fullheight": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Full Height",
              "x-form-type": "materialswitch",
              "x-default": "false"
            },
            "toppadding": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Top Padding",
              "x-form-type": "materialrange",
              "x-form-min": 0,
              "x-form-max": 300,
              "x-form-visible": "model.fullheight != 'true'"
            },
            "bottompadding": {
              "type": "string",
              "x-source": "inject",
              "x-form-label": "Bottom Padding",
              "x-form-type": "materialrange",
              "x-form-min": 0,
              "x-form-max": 300,
              "x-form-visible": "model.fullheight != 'true'"
            }
          }
        }
      }
    }
  },
  "name": "Pagetitle",
  "componentPath": "themecleanflex/components/pagetitle",
  "package": "com.themecleanflex.models",
  "modelName": "Pagetitle",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/pagetitle",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class PagetitleModel extends SimpletextModel {

  public PagetitleModel(Resource r) { super(r); }

//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

  private static final Logger LOG = LoggerFactory.getLogger(PagetitleModel.class);

	public String getText() {
		try{
      Resource page = getCurrentPage(getRootResource());
      Resource jcrcontent = page == null ? null : page.getChild(JCR_CONTENT);
			ValueMap props = jcrcontent.adaptTo(ValueMap.class);
      return props.get(JCR_TITLE, "title not found");
		} catch(Exception e){
			LOG.error("getPageTitle error: {}",e);
			return "title not found....";
		}
  }
  
  private Resource getCurrentPage(Resource resource) {
    if(resource == null) { return null; }
    String resourceType = null;
    try{
      ValueMap props = resource.adaptTo(ValueMap.class);
      resourceType = props.get(JCR_PRIMARY_TYPE, "type not found");
      LOG.debug("resource type is: " + resourceType + "  path is:" + resource.getPath());
      // we only care about per:page node
      if(PAGE_PRIMARY_TYPE.equals(resourceType)) {
        LOG.debug("returned resource type is: " + resourceType + "  path is:" + resource.getPath());
        return resource;
      }
      else {
        if(resource.getParent() != null) {
          return getCurrentPage(resource.getParent());
        }
      }
    } catch(Exception e){
        LOG.error("Exception: " + e);
    }
    return null;
  }
}