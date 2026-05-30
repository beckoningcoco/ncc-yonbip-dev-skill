# |<<

**润滑油定义 (elm_lubedefinition / nc.vo.elm.lubedefinition.LubeDefinitionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1792.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lubedefinition | 主键 | pk_lubedefinition | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | brand | 油牌号 | brand | varchar(50) |  | 字符串 (String) |
| 8 | form | 形态 | form | int |  | 形态 (Form) |  | 1=液体; |