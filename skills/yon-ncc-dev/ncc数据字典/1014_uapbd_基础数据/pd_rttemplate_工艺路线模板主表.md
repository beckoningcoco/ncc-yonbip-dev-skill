# |<<

**工艺路线模板主表 (pd_rttemplate / nc.vo.bd.rt.rt0006.entity.RtTemplateHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4380.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crttemplateid | 工艺路线模板 | crttemplateid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vrttemplatecode | 工艺路线模板编码 | vrttemplatecode | varchar(50) | √ | 字符串 (String) |
| 6 | vrttemplatename | 工艺路线模板名称 | vrttemplatename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 8 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 9 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 10 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 11 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 12 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 28 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 29 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 30 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 31 | modifiedtime | 最后修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |