# |<<

**废品回收单主表 (cm_scraprecl / nc.vo.cm.bill.bill0316.ScrapReclHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1505.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cscrapreclid | 废品回收单主键 | cscrapreclid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织主键 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本主键 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 7 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 8 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 10 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 11 | nmoney | 回收金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | vdef1 | vdef1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vdef2 | vdef2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef3 | vdef3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef4 | vdef4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef5 | vdef5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef6 | vdef6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef7 | vdef7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef8 | vdef8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef9 | vdef9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef10 | vdef10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef20 | vdef20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef19 | vdef19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef18 | vdef18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef17 | vdef17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef16 | vdef16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef15 | vdef15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef14 | vdef14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef13 | vdef13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef12 | vdef12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef11 | vdef11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 32 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 33 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 34 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 35 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |