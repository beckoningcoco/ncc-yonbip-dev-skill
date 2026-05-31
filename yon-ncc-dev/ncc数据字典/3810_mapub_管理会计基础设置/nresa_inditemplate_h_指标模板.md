# |<<

**指标模板 (nresa_inditemplate_h / nc.vo.mapub.indi.inditemplate.IndiTemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3870.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inditemplate | 指标模板主键 | pk_inditemplate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 指标模板编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 指标模板名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | containvalue | 包含信息价值 | containvalue | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bothsides | 涉及双方交易 | bothsides | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | note | 备注 | note | varchar(200) |  | 字符串 (String) |
| 10 | crossorg | 允许跨组织 | crossorg | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | origin | 来源 | origin | int |  | 指标模板来源 (IndiOriginEnum) |  | 1=公共; |