# |<<

**日志表 (bc_log / nc.vo.bcsi.entity.Log)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/243.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 主键 | pk_log | char(50) | √ | 字符串 (String) |
| 2 | vbcsictrantypeid | 单据类型 | vbcsictrantypeid | varchar(50) |  | 字符串 (String) |
| 3 | vbcsibillcode | 单据号 | vbcsibillcode | varchar(50) |  | 字符串 (String) |
| 4 | vbcsiid | 单据主键 | vbcsiid | char(20) |  | 主键 (UFID) |
| 5 | vbcsibid | 单据行主键 | vbcsibid | char(20) |  | 主键 (UFID) |
| 6 | dbcsibilltime | 发送日期 | dbcsibilltime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | vbcsinum | 发送数量 | vbcsinum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | vncctrantypeid | nc单据类型 | vncctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | vncbillcode | nc单据号 | vncbillcode | varchar(50) |  | 字符串 (String) |
| 10 | vncid | nc单据主键 | vncid | char(20) |  | 主键 (UFID) |
| 11 | vncbid | nc单据行主键 | vncbid | char(20) |  | 主键 (UFID) |
| 12 | btype | 操作状态 | btype | varchar(50) |  | 字符串 (String) |
| 13 | vdef1 | 自定义项目1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef2 | 自定义项目2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef3 | 自定义项目3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef4 | 自定义项目4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef5 | 自定义项目5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef6 | 自定义项目6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef7 | 自定义项目7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef8 | 自定义项目8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef9 | 自定义项目9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef10 | 自定义项目10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef11 | 自定义项目11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef12 | 自定义项目12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef13 | 自定义项目13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef14 | 自定义项目14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef15 | 自定义项目15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef16 | 自定义项目16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef17 | 自定义项目17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef18 | 自定义项目18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef19 | 自定义项目19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef20 | 自定义项目20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |