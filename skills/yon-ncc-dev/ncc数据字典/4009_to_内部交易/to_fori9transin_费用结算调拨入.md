# |<<

**费用结算调拨入 (to_fori9transin / nc.vo.to.m4552.entity.ForI9TransInHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5794.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 费用结算调拨入 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 成本域 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | vtrantypecode | 出入库类型 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | cstockorgid | 库存组织 | cstockorgid | char(20) |  | 主键 (UFID) |
| 8 | cstockorgvid | 库存组织版本 | cstockorgvid | char(20) |  | 主键 (UFID) |
| 9 | cstordocid | 仓库 | cstordocid | char(20) |  | 主键 (UFID) |
| 10 | cstordocmanid | 库管员 | cstordocmanid | char(20) |  | 主键 (UFID) |
| 11 | cdeptid | 部门 | cdeptid | char(20) |  | 主键 (UFID) |
| 12 | cdeptvid | 部门版本 | cdeptvid | char(20) |  | 主键 (UFID) |
| 13 | cpsnid | 业务员 | cpsnid | char(20) |  | 主键 (UFID) |
| 14 | coutstockorgid | 调出库存组织 | coutstockorgid | char(20) |  | 主键 (UFID) |
| 15 | coutstockorgvid | 调出库存组织版本 | coutstockorgvid | char(20) |  | 主键 (UFID) |
| 16 | ctakestockorgid | 出货库存组织 | ctakestockorgid | char(20) |  | 主键 (UFID) |
| 17 | ctakestockorgvid | 出货库存组织版本 | ctakestockorgvid | char(20) |  | 主键 (UFID) |
| 18 | cbiztypeid | 业务类型 | cbiztypeid | char(20) |  | 主键 (UFID) |
| 19 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 20 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 21 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef31 | 自定义项31 | vdef31 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef32 | 自定义项32 | vdef32 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef33 | 自定义项33 | vdef33 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef34 | 自定义项34 | vdef34 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef35 | 自定义项35 | vdef35 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef36 | 自定义项36 | vdef36 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef37 | 自定义项37 | vdef37 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef38 | 自定义项38 | vdef38 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef39 | 自定义项39 | vdef39 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef40 | 自定义项40 | vdef40 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef41 | 自定义项41 | vdef41 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef42 | 自定义项42 | vdef42 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef43 | 自定义项43 | vdef43 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef44 | 自定义项44 | vdef44 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef45 | 自定义项45 | vdef45 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef46 | 自定义项46 | vdef46 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef47 | 自定义项47 | vdef47 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef48 | 自定义项48 | vdef48 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vdef49 | 自定义项49 | vdef49 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vdef50 | 自定义项50 | vdef50 | varchar(101) |  | 自定义项 (Custom) |