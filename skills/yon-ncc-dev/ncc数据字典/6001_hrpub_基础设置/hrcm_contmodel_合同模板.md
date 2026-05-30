# |<<

**合同模板 (hrcm_contmodel / nc.vo.hrcm.templet.ContmodelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2707.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conmodel | 模板主键 | pk_conmodel | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | vmodelcode | 模板编号 | vmodelcode | varchar(28) |  | 字符串 (String) |
| 4 | vmodelname | 模板名称 | vmodelname | varchar(50) |  | 多语文本 (MultiLangText) |
| 5 | modeltext | 模板内容 | modeltext | image |  | 图片类型 (IMAGE) |
| 6 | vmodeltype | 合同模版类型 | vmodeltype | varchar(50) |  | 合同模板类型 (modeltype) |  | 1002Z710000000017GUF=劳动合同; |