# |<<

**粗能力计划子表（来源表） (mm_rccp_b / nc.vo.mmpps.rccp1304.RCCPItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3758.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rccp_b | 负荷子表ID | pk_rccp_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 库存组织主键 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 库存组织版本主键 | pk_org_v | varchar(20) |  | 主键 (UFID) |
| 5 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 6 | cvendorid | 供应商主键 | cvendorid | varchar(20) |  | 字符串 (String) |
| 7 | cproductorid | 生产厂商主键 | cproductorid | varchar(20) |  | 字符串 (String) |
| 8 | cprojectid | 项目主键 | cprojectid | varchar(20) |  | 项目 (project) |
| 9 | cpoid | 计划订单id | cpoid | char(20) |  | 主键 (UFID) |
| 10 | cmaterialid | 物料id | cmaterialid | char(20) |  | 主键 (UFID) |
| 11 | cmaterialvid | 物料版本id | cmaterialvid | char(20) |  | 主键 (UFID) |
| 12 | nponumber | 订单数量 | nponumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | npreparecapacity | 准备负荷 | npreparecapacity | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nworkcapacity | 加工负荷 | nworkcapacity | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ndisassemcapacity | 拆卸负荷 | ndisassemcapacity | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nloadtype | 负荷类型 | nloadtype | int |  | 整数 (Integer) |
| 17 | ddemanddate | 需求日期 | ddemanddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 18 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 19 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 20 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 21 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 22 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 23 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 24 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 25 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 26 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 27 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 28 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |