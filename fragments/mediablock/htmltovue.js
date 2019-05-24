module.exports = {
    convert: function($, f) {
        f.bindPath($);
        f.bindAttribute($.parent(),'model','model')
        f.replace( $.find('img').first(), '<themecleanflex-components-media v-bind:model="model"></themecleanflex-components-media>')
        f.addIf($.find('.perIsEditAndEmpty').first(), 'isEditAndEmpty')
        f.bindAttribute($, 'style', "{flexBasis:`${model.mediawidth}%`}")
    }
}
