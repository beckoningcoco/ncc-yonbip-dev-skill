# |<<

**汇总表 (mm_calcsum / nc.vo.mmpps.calc.entity.calculate.SumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3651.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppssumid | 汇总表 | cppssumid | char(36) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | demandtime | 时格需求日期 | demandtime | char(19) |  | 日期 (UFDate) |
| 6 | npredemandnum | 计划独立需求量 | npredemandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nfactdemandnum | 实际需求量 | nfactdemandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nreservationnum | 预留量 | nreservationnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ngrossdemandnum | 毛需求 | ngrossdemandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nbeginpabnum | 期初预计可用存量 | nbeginpabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nplanacceptnum | 计划接收量 | nplanacceptnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nnetdemandnum | 净需求 | nnetdemandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nplaninputnum | 计划投入量 | nplaninputnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nplanoutputnum | 计划产出量 | nplanoutputnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nendpabnum | 期末预计可用存量 | nendpabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | computecode | 运算标识 | computecode | varchar(40) |  | 字符串 (String) |
| 17 | pk_demandorg | 需求库存组织最新版本 | pk_demandorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 18 | pk_demandorg_v | 需求库存组织 | pk_demandorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 19 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 20 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 21 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 22 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 23 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 24 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 25 | cgroupkey | 分类标识 | cgroupkey | varchar(300) |  | 字符串 (String) |
| 26 | nsdemandnum | 替代需求量 | nsdemandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nssupplynum | 替代供给量 | nssupplynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nexplanacceptnum | 超期计划接收量 | nexplanacceptnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nreldemandnum | 相关需求量 | nreldemandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nsupplyassignnum | 供给已分配量 | nsupplyassignnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 32 | ntallocknum | 累积锁定态预留量 | ntallocknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | ntalallocatnum | 累积分配态预留量 | ntalallocatnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 37 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 44 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |