# |<<

**清算回单 (cfbm_reckonback / nc.vo.cfbm.reckonback.ReckonBackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1422.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reckonback | 主键 | pk_reckonback | char(20) | √ | 主键 (UFID) |
| 2 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 3 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 4 | saga_btxid | 本地事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 5 | saga_status | saga事务状态 | saga_status | int |  | 整数 (Integer) |
| 6 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | pk_prereckonorg | 上级清算组织 | pk_prereckonorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 12 | pk_prereckonorg_v | 上级清算组织版本 | pk_prereckonorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 13 | reckon_direction | 清算方向 | reckon_direction | int |  | 清算方向 (ReckonDirection) |  | 1=单位收款; |