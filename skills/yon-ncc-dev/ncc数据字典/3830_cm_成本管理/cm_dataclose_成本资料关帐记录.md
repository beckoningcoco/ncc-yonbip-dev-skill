# |<<

**成本资料关帐记录 (cm_dataclose / nc.vo.cm.beginaccount.entity.DataCloseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1467.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdatacloseid | 成本资料关帐记录 | cdatacloseid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 启用会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | bbegin | 类别 | bbegin | int |  | 期初记账类别 (CMAccountTypeEnum) |  | 1=期初记账; |