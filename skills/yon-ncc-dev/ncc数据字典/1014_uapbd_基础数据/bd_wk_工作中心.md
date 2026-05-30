# |<<

**工作中心 (bd_wk / nc.vo.bd.wk.wk0104.entity.BDWkVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1155.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwkid | 工作中心 | cwkid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cwkclassid | 工作中心分类 | cwkclassid | varchar(20) | √ | 工作中心分类 (bd_wkclass) |
| 6 | vwkcode | 工作中心编码 | vwkcode | varchar(40) | √ | 字符串 (String) |
| 7 | vwkname | 工作中心名称 | vwkname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 8 | cdeptid | 所属部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | cdeptvid | 所属部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (EnableStateEnum) |  | 2=已启用; |