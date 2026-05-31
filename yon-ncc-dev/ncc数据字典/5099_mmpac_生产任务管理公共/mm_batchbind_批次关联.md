# |<<

**批次关联 (mm_batchbind / nc.vo.mmpac.batchass.pick.entity.BatchBindVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3631.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbindid | 批次关联 | cbindid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmaterialid | 产品最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 产品 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cmoid | 生产订单id | cmoid | char(20) |  | 主键 (UFID) |
| 8 | vmobillcode | 生产订单号 | vmobillcode | varchar(50) |  | 字符串 (String) |
| 9 | cmohid | 生产订单头id | cmohid | char(20) |  | 主键 (UFID) |
| 10 | vmorowno | 生产订单行号 | vmorowno | varchar(50) |  | 字符串 (String) |
| 11 | vbatchcode | 生产批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 12 | vbatchcodeid | 生产批次号id | vbatchcodeid | char(20) |  | 主键 (UFID) |
| 13 | cserialcodeid | 序列号标识 | cserialcodeid | char(20) |  | 主键 (UFID) |
| 14 | vserialcode | 序列号 | vserialcode | varchar(40) |  | 字符串 (String) |
| 15 | pk_wr_serialno | 生产报告序列号 | pk_wr_serialno | varchar(20) |  | 字符串 (String) |
| 16 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 17 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 18 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 19 | saga_btxid | 子事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 20 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) | 0 |
| 21 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) | 0 |
| 22 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 23 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 25 | modifiedtime | 最后修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |