# |<<

**合同日志 (ewm_mtcon_log / nc.vo.ewm.maintaincon.MaintainConLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1934.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_log | 合同日志主键 | pk_mtcon_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_recorder | 记录人 | pk_recorder | varchar(20) |  | 用户 (user) |
| 7 | record_date | 记录时间 | record_date | char(19) |  | 日期时间 (UFDateTime) |
| 8 | content | 内容 | content | varchar(200) |  | 字符串 (String) |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |