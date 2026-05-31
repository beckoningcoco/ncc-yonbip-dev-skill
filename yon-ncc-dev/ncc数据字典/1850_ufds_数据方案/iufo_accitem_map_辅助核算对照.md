# |<<

**辅助核算对照 (iufo_accitem_map / nc.vo.iufo.v5fetchdata.comm.AccassItemMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3383.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map | 主键 | pk_map | char(20) | √ | 主键 (UFID) |
| 2 | pk_map_assaccitem | V5系统辅助核算类型 | pk_map_assaccitem | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 3 | itemno | 辅助核算顺序 | itemno | int |  | 整数 (Integer) |
| 4 | pk_owen_assaccitem | V6系统辅助核算类型 | pk_owen_assaccitem | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 5 | dsname | 数据源 | dsname | varchar(50) |  | 字符串 (String) |
| 6 | mapcolumn | 映射字段 | mapcolumn | varchar(50) |  | 字符串 (String) |
| 7 | metadataid | 元数据ID | metadataid | varchar(100) |  | 字符串 (String) |
| 8 | issyncdoc | 同步档案 | issyncdoc | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |