# |<<

**排班_调整记录 (uh_sch_adj / com.yonyou.yh.nhis.sch.sch.vo.SchAdjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schadj | 逻辑主键 | pk_schadj | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_sch | 排班主键 | pk_sch | varchar(20) |  | 排班预约_排班 (SchVO) |
| 5 | sortno | 调整序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_schadjtype | 调整类型 | pk_schadjtype | varchar(20) |  | 排班调整类型(自定义档案) (Defdoc-020000) |
| 7 | dt_schadjtype | 调整类型编码 | dt_schadjtype | char(20) |  | 字符串 (String) |
| 8 | count_old | 原数量 | count_old | int |  | 整数 (Integer) |
| 9 | count_new | 新数量 | count_new | int |  | 整数 (Integer) |
| 10 | pk_psn_adj | 调整人员 | pk_psn_adj | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | adjdate | 调整日期 | adjdate | char(19) |  | 日期时间 (UFDateTime) |
| 12 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 13 | pk_org_v | 所属组织机构版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 34 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 35 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 36 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 37 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |