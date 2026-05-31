# |<<

**作业申报体 (mm_ta_b / nc.vo.mmpac.apply.task.entity.TaskABVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3790.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ta_b | 作业申报体 | pk_ta_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 6 | cbwkid | 工作中心 | cbwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 7 | cbteamid | 班组 | cbteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 8 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 9 | dtaskdate | 作业日期 | dtaskdate | char(19) |  | 日期 (UFDate) |
| 10 | nstandnum | 标准作业量 | nstandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nactnum | 实际作业量 | nactnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | vbnote | 备注 | vbnote | varchar(181) |  | 字符串 (String) |
| 13 | crtbid | 工序 | crtbid | char(20) |  | 主键 (UFID) |
| 14 | vprocessno | 工序号 | vprocessno | varchar(50) |  | 字符串 (String) |
| 15 | crcid | 工序类型 | crcid | varchar(20) |  | 标准工序 (pd_rc) |
| 16 | cbunitid | 计量单位 | cbunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | nbwrnum | 完工主数量 | nbwrnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nbwrastnum | 完工数量 | nbwrastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | cbwrunitid | 主单位 | cbwrunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | cbwrastunitid | 单位 | cbwrastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 21 | vbchangerate | 换算率 | vbchangerate | varchar(60) |  | 字符串 (String) |
| 22 | cbdeptid | 生产部门最新版本 | cbdeptid | varchar(20) |  | 组织_部门 (dept) |
| 23 | cbdeptvid | 生产部门 | cbdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 24 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |