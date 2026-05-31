# |<<

**备料计划 (mm_procon_pickm / nc.vo.mmpac.proconsole.entity.ProConPickmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3749.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | 备料计划明细 | cid | char(20) | √ | 主键 (UFID) |
| 2 | coperheadid | 表头 | coperheadid | varchar(50) |  | 字符串 (String) |
| 3 | cpickmid | 备料计划单 | cpickmid | varchar(50) |  | 字符串 (String) |
| 4 | cpickm_bid | 备料计划单表体 | cpickm_bid | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | nsourcetype | 备料计划来源 | nsourcetype | varchar(50) |  | 字符串 (String) |
| 9 | vbillcode | 备料计划单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 10 | cbusitypeid | 备料类型 | cbusitypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | cmoid | 生产订单 | cmoid | char(20) |  | 主键 (UFID) |
| 12 | vmocode | 生产订单号 | vmocode | varchar(50) |  | 字符串 (String) |
| 13 | cmobid | 生产订单明细 | cmobid | varchar(50) |  | 字符串 (String) |
| 14 | vmorowno | 生产订单行号 | vmorowno | varchar(50) |  | 字符串 (String) |
| 15 | cdeptid | 用料部门最新 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | cdeptvid | 用料部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | fbillstatus | 备料状态 | fbillstatus | int |  | 备料计划单状态 (FbillstatusEnum) |  | -1=自由; |