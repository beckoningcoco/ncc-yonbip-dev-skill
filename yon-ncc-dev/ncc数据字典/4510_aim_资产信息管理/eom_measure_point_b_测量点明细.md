# |<<

**测量点明细 (eom_measure_point_b / nc.vo.am.measurepoint.MeaspointBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure_point_b | 测量点明细标识 | pk_measure_point_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_measure_point | 测量点 | pk_measure_point | varchar(20) |  | 测量点 (measpointHeadVO) |
| 6 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 7 | pk_meas_items | 测量项目 | pk_meas_items | varchar(20) |  | 测量项目 (measureitems) |
| 8 | pk_measuredoc | 测量单位 | pk_measuredoc | varchar(20) |  | 计量单位 (measdoc) |
| 9 | item_describe | 测量项目说明 | item_describe | varchar(80) |  | 字符串 (String) |
| 10 | alert_upper | 预警上限 | alert_upper | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | alert_lower | 预警下限 | alert_lower | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | work_upper | 操作上限 | work_upper | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | work_lower | 操作下限 | work_lower | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 15 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |