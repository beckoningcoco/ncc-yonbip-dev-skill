# |<<

**利润中心组 (org_pfgroup / nc.vo.profitcentergroup.ProfitCenterGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4121.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pfgroup | 利润中心组标识 | pk_pfgroup | char(20) | √ | 主键 (UFID) |
| 2 | gcode | 编码 | gcode | varchar(50) |  | 字符串 (String) |
| 3 | gname | 名称 | gname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | principal | 负责人 | principal | varchar(20) |  | 人员基本信息 (psndoc) |
| 5 | isbudget | 是否预算 | isbudget | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态 (ebablestatus) |  | 1=未启用; |