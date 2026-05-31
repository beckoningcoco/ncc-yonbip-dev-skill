# |<<

**生产订单挪料 (mm_moexchange / nc.vo.mmpac.pac0206.MoExchangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3697.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmoid | 生产订单 | cmoid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | cbusitypeid | 交易类型 | cbusitypeid | varchar(20) |  | 字符串 (String) |
| 6 | vbillcode | 生产订单号 | vbillcode | varchar(40) |  | 流程生产订单明细 (mm_mo) |
| 7 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 字符串 (String) |
| 8 | cmaterialvid | 物料最新版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 字符串 (String) |
| 10 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 字符串 (String) |
| 11 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 字符串 (String) |
| 12 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 15 | cdeptid | 生产部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | cdeptvid | 生产部门版本 | cdeptvid | varchar(20) |  | 字符串 (String) |
| 17 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 18 | vparentbillcode | 上级生产订单号 | vparentbillcode | varchar(40) |  | 字符串 (String) |
| 19 | cparentbillid | 上级生产订单 | cparentbillid | varchar(20) |  | 字符串 (String) |
| 20 | vsalebillcode | 销售订单号 | vsalebillcode | varchar(40) |  | 字符串 (String) |
| 21 | fmotype | 订单类型 | fmotype | int |  | 生产订单类型 (FmotypeEnum) |  | 0=普通; |