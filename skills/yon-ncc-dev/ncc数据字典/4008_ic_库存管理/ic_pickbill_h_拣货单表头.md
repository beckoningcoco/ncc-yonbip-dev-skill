# |<<

**拣货单表头 (ic_pickbill_h / nc.vo.ic.m4v.entity.PickBillHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2953.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 拣货单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 批处理号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 4 | executor | 执行人 | executor | varchar(20) |  | 用户 (user) |
| 5 | executiontime | 执行时间 | executiontime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 7 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | execflag | 是否已经出库 | execflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | creationtime | 制单时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |