# |<<

**批次档案 (scm_batchcode / nc.vo.scmf.ic.mbatchcode.BatchcodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5206.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchcode | 主键 | pk_batchcode | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialoid | 物料编码 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 3 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 5 | vvendbatchcode | 供应商批次号 | vvendbatchcode | varchar(50) |  | 字符串 (String) |
| 6 | tchecktime | 上次检验日期 | tchecktime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 8 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期 (UFDate) |
| 9 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 10 | bseal | 封存 | bseal | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | tbatchtime | 批次形成时间 | tbatchtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | vnote | 备注 | vnote | varchar(200) |  | 字符串 (String) |
| 13 | binqc | 在检 | binqc | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | csourcetype | 创建批次档案单据类型 | csourcetype | varchar(10) |  | 字符串 (String) |
| 15 | vsourcebillcode | 创建批次档案单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 16 | vsourcerowno | 创建批次档案单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 17 | csourcebid | 创建批次单据BID | csourcebid | varchar(20) |  | 主键 (UFID) |
| 18 | csourcehid | 创建批次单据HID | csourcehid | varchar(20) |  | 主键 (UFID) |
| 19 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 20 | version | 版本号 | version | int |  | 整数 (Integer) |
| 21 | vhashcode | 散列码 | vhashcode | varchar(100) | √ | 字符串 (String) |
| 22 | vprodbatchcode | 生产批次号 | vprodbatchcode | varchar(40) |  | 字符串 (String) |
| 23 | dinbounddate | 首次入库日期 | dinbounddate | char(19) |  | 日期 (UFDate) |
| 24 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |