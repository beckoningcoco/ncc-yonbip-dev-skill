# |<<

**薪资分摊子表 (wa_datapool_b / nc.vo.wa.datainterface.DataPoolBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_datapool_b | 事务池子表主键 | pk_wa_datapool_b | char(20) | √ | 主键 (UFID) |
| 2 | deptid | 部门主键 | deptid | char(20) |  | 主键 (UFID) |
| 3 | pk_psnbasdoc | 人员基本主键 | pk_psnbasdoc | char(20) |  | 主键 (UFID) |
| 4 | psnid | 人员主键 | psnid | char(20) |  | 主键 (UFID) |
| 5 | psnclid | 人员类别主键 | psnclid | char(20) |  | 主键 (UFID) |
| 6 | fmny | 金额 | fmny | decimal(31, 8) |  | 数值 (UFDouble) |
| 7 | pk_wa_item | 薪资项目主键 | pk_wa_item | char(20) |  | 主键 (UFID) |
| 8 | pk_wa_datapool | 事务池PK | pk_wa_datapool | char(20) |  | 主键 (UFID) |
| 9 | pk_amo_org | 分摊组织 | pk_amo_org | char(20) |  | 主键 (UFID) |
| 10 | fratio | 分摊比例 | fratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | deptvid | 部门主键版本 | deptvid | char(20) |  | 主键 (UFID) |
| 12 | amoorgvid | 分摊组织版本 | amoorgvid | char(20) |  | 主键 (UFID) |
| 13 | factor1 | 自定义影响因素1 | factor1 | char(20) |  | 主键 (UFID) |
| 14 | factor2 | 自定义影响因素2 | factor2 | char(20) |  | 主键 (UFID) |
| 15 | factor3 | 自定义影响因素3 | factor3 | char(20) |  | 主键 (UFID) |
| 16 | factor4 | 自定义影响因素4 | factor4 | char(20) |  | 主键 (UFID) |
| 17 | factor5 | 自定义影响因素5 | factor5 | char(20) |  | 主键 (UFID) |
| 18 | factor6 | 自定义影响因素6 | factor6 | char(20) |  | 主键 (UFID) |
| 19 | factor7 | 自定义影响因素7 | factor7 | char(20) |  | 主键 (UFID) |
| 20 | factor8 | 自定义影响因素8 | factor8 | char(20) |  | 主键 (UFID) |
| 21 | factor9 | 自定义影响因素9 | factor9 | char(20) |  | 主键 (UFID) |
| 22 | factor10 | 自定义影响因素10 | factor10 | char(20) |  | 主键 (UFID) |
| 23 | factor11 | 自定义影响因素11 | factor11 | char(20) |  | 主键 (UFID) |
| 24 | factor12 | 自定义影响因素12 | factor12 | char(20) |  | 主键 (UFID) |
| 25 | factor13 | 自定义影响因素13 | factor13 | char(20) |  | 主键 (UFID) |
| 26 | factor14 | 自定义影响因素14 | factor14 | char(20) |  | 主键 (UFID) |
| 27 | factor15 | 自定义影响因素15 | factor15 | char(20) |  | 主键 (UFID) |
| 28 | factor16 | 自定义影响因素16 | factor16 | char(20) |  | 主键 (UFID) |
| 29 | factor17 | 自定义影响因素17 | factor17 | char(20) |  | 主键 (UFID) |
| 30 | factor18 | 自定义影响因素18 | factor18 | char(20) |  | 主键 (UFID) |
| 31 | factor19 | 自定义影响因素19 | factor19 | char(20) |  | 主键 (UFID) |
| 32 | factor20 | 自定义影响因素20 | factor20 | char(20) |  | 主键 (UFID) |