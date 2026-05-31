# |<<

**库存借出还回单表头 (ic_returnin_h / nc.vo.ic.m4b.entity.ReturnInHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2966.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 入库单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 8 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | vtrantypecode | 出入库类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 11 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 13 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | cbizid | 业务员 | cbizid | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 16 | vnote | 备注 | vnote | varchar(200) |  | 字符串 (String) |
| 17 | fbillflag | 单据状态 | fbillflag | int |  | 整数 (Integer) |
| 18 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 19 | ntotalnum | 总数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ntotalweight | 总重量 | ntotalweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ntotalvolume | 总体积 | ntotalvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ntotalpiece | 总件数 | ntotalpiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 24 | approver | 签字人 | approver | varchar(20) |  | 用户 (user) |
| 25 | taudittime | 签字日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 26 | ctrantypeid | 出入库类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 27 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 28 | vdef1 | 表头自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef2 | 表头自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef3 | 表头自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef4 | 表头自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef5 | 表头自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef6 | 表头自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef7 | 表头自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef8 | 表头自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef9 | 表头自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef10 | 表头自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef11 | 表头自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef12 | 表头自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef13 | 表头自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef14 | 表头自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef15 | 表头自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef16 | 表头自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef17 | 表头自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef18 | 表头自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef19 | 表头自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef20 | 表头自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef21 | 表头自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef22 | 表头自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef23 | 表头自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef24 | 表头自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef25 | 表头自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef26 | 表头自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef27 | 表头自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef28 | 表头自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef29 | 表头自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef30 | 表头自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef31 | 表头自定义项31 | vdef31 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef32 | 表头自定义项32 | vdef32 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef33 | 表头自定义项33 | vdef33 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef34 | 表头自定义项34 | vdef34 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef35 | 表头自定义项35 | vdef35 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef36 | 表头自定义项36 | vdef36 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef37 | 表头自定义项37 | vdef37 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef38 | 表头自定义项38 | vdef38 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef39 | 表头自定义项39 | vdef39 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef40 | 表头自定义项40 | vdef40 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef41 | 表头自定义项41 | vdef41 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vdef42 | 表头自定义项42 | vdef42 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vdef43 | 表头自定义项43 | vdef43 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vdef44 | 表头自定义项44 | vdef44 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vdef45 | 表头自定义项45 | vdef45 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vdef46 | 表头自定义项46 | vdef46 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vdef47 | 表头自定义项47 | vdef47 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vdef48 | 表头自定义项48 | vdef48 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vdef49 | 表头自定义项49 | vdef49 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vdef50 | 表头自定义项50 | vdef50 | varchar(101) |  | 自定义项 (Custom) |
| 78 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 79 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 80 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 81 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |