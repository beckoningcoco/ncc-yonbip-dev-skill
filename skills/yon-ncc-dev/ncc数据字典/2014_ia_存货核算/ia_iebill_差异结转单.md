# |<<

**差异结转单 (ia_iebill / nc.vo.ia.mie.entity.IEHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 差异结转单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 主键 (UFID) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | cstockorgid | 库存组织 | cstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | cstockorgvid | 库存组织版本 | cstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | cstordocid | 仓库 | cstordocid | varchar(20) |  | 仓库 (stordoc) |
| 11 | cstordocmanid | 库管员 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 13 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | cbiztypeid | 业务类型 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 16 | ccustomerid | 开票客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 17 | fintransitflag | 发出商品标志 | fintransitflag | int |  | 发出商品标志 (intransit) |  | -1=非发出商品; |