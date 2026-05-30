# |<<

**投料点维护 (bd_wk_feed / nc.vo.bd.wk.wk0106.entity.TwVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1156.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwk_feedid | 工作中心投料点 | cwk_feedid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 6 | vfeedpointcode | 投料点编码 | vfeedpointcode | varchar(40) |  | 字符串 (String) |
| 7 | vfeedpointname | 投料点名称 | vfeedpointname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (EnablestatusEnum) | 2 | 2=已启用; |