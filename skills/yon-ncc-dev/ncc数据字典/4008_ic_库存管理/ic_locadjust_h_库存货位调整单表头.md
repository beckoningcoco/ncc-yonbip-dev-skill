# |<<

**库存货位调整单表头 (ic_locadjust_h / nc.vo.ic.m4q.entity.LocAdjustHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2920.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 货位调整单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 6 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 7 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 10 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | vnote | 备注 | vnote | varchar(200) |  | 字符串 (String) |
| 12 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 13 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 14 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 15 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 16 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 17 | vdef1 | 表头自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef2 | 表头自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef3 | 表头自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef4 | 表头自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef5 | 表头自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef6 | 表头自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef7 | 表头自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef8 | 表头自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef9 | 表头自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef10 | 表头自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef11 | 表头自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef12 | 表头自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef13 | 表头自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef14 | 表头自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef15 | 表头自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef16 | 表头自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef17 | 表头自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef18 | 表头自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef19 | 表头自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef20 | 表头自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef21 | 表头自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef22 | 表头自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef23 | 表头自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef24 | 表头自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef25 | 表头自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef26 | 表头自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef27 | 表头自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef28 | 表头自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef29 | 表头自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef30 | 表头自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef31 | 表头自定义项31 | vdef31 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef32 | 表头自定义项32 | vdef32 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef33 | 表头自定义项33 | vdef33 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef34 | 表头自定义项34 | vdef34 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef35 | 表头自定义项35 | vdef35 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef36 | 表头自定义项36 | vdef36 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef37 | 表头自定义项37 | vdef37 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef38 | 表头自定义项38 | vdef38 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef39 | 表头自定义项39 | vdef39 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef40 | 表头自定义项40 | vdef40 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef41 | 表头自定义项41 | vdef41 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef42 | 表头自定义项42 | vdef42 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef43 | 表头自定义项43 | vdef43 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef44 | 表头自定义项44 | vdef44 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef45 | 表头自定义项45 | vdef45 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef46 | 表头自定义项46 | vdef46 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef47 | 表头自定义项47 | vdef47 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef48 | 表头自定义项48 | vdef48 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef49 | 表头自定义项49 | vdef49 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef50 | 表头自定义项50 | vdef50 | varchar(101) |  | 自定义项 (Custom) |
| 67 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 68 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |