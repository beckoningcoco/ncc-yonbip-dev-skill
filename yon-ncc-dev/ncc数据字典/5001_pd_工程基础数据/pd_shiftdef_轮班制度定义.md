# |<<

**轮班制度定义 (pd_shiftdef / nc.vo.pd.shiftdef.entity.LbdyHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4383.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cshiftdefid | 轮班制度定义 | cshiftdefid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心生产档案 (pd_wk) |
| 6 | ishiftcircle | 轮班周期天数 | ishiftcircle | int |  | 整数 (Integer) |
| 7 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 8 | vcode | 轮班制度编码 | vcode | varchar(50) |  | 字符串 (String) |
| 9 | vname | 轮班制度名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 10 | isenable | 启用状态 | isenable | int |  | 启用状态 (轮班制度定义启用状态) |  | 2=已启用; |