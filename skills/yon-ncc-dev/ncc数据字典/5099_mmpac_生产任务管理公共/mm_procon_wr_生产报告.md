# |<<

**生产报告 (mm_procon_wr / nc.vo.mmpac.proconsole.entity.ProConWrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3752.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | 生产报告 | cid | char(20) | √ | 主键 (UFID) |
| 2 | coperheadid | 表头 | coperheadid | varchar(50) |  | 字符串 (String) |
| 3 | cwrid | 生产报告头 | cwrid | varchar(50) |  | 字符串 (String) |
| 4 | cwr_bid | 生产报告明细 | cwr_bid | varchar(50) |  | 字符串 (String) |
| 5 | cwr_qualityid | 质检报告（孙表） | cwr_qualityid | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 9 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 10 | ctrantypeid | 报告类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | cmoid | 生产订单 | cmoid | varchar(50) |  | 字符串 (String) |
| 12 | cmocode | 生产订单号 | cmocode | varchar(50) |  | 字符串 (String) |
| 13 | cmobid | 生产订单明细 | cmobid | varchar(50) |  | 字符串 (String) |
| 14 | vmorowno | 生产订单行号 | vmorowno | varchar(50) |  | 字符串 (String) |
| 15 | cdeptid | 生产部门最新 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | cdeptvid | 生产部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 18 | cteamid | 班组 | cteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 19 | cclassid | 班次 | cclassid | varchar(20) |  | 班次 (bdshift) |
| 20 | cworkmanid | 作业员 | cworkmanid | varchar(20) |  | 用户 (user) |
| 21 | dmakedate | 报产日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 22 | fproducttype | 产品类型 | fproducttype | int |  | 产出类型 (outputtype) |  | 1=主产品; |