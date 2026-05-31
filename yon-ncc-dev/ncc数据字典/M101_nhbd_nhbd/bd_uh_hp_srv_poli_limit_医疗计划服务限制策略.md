# |<<

**医疗计划服务限制策略 (bd_uh_hp_srv_poli_limit / com.yonyou.yh.nhis.bd.healthplan.vo.HPSrvLimitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1039.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpsrvpolilimit | 医保计划服务项目限制策略主键 | pk_hpsrvpolilimit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 5 | pk_hpsrv | 医保计划服务 | pk_hpsrv | char(20) |  | 主键 (UFID) |
| 6 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 7 | quanval_ord | 数量限制值_单处方 | quanval_ord | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | quanval_pv | 数量限制值_本次就诊 | quanval_pv | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | quanstr_date | 数量限制范式_期间 | quanstr_date | varchar(200) |  | 备注 (Memo) |
| 10 | amtval_ord | 金额限制值_单处方 | amtval_ord | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | amtval_pv | 金额限制值_本次就诊 | amtval_pv | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | amtval_date | 金额限制范式_期间 | amtval_date | varchar(200) |  | 备注 (Memo) |
| 13 | func | 外挂函数 | func | varchar(200) |  | 备注 (Memo) |