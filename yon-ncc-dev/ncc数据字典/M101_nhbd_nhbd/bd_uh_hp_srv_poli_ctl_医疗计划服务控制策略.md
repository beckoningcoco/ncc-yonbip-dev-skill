# |<<

**医疗计划服务控制策略 (bd_uh_hp_srv_poli_ctl / com.yonyou.yh.nhis.bd.healthplan.vo.HPSrvCtlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1038.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpsrvpolictl | 医保计划服务项目控制策略主键 | pk_hpsrvpolictl | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 5 | pk_hpsrv | 医保计划服务 | pk_hpsrv | char(20) |  | 主键 (UFID) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | pk_dt_hpsrvpolictl | 控制分类 | pk_dt_hpsrvpolictl | varchar(20) |  | 医保政策控制类别(自定义档案) (Defdoc-040004) |
| 8 | dt_hpsrvpolictl | 控制分类编码 | dt_hpsrvpolictl | varchar(50) |  | 字符串 (String) |
| 9 | code | 控制项编码 | code | varchar(50) |  | 字符串 (String) |
| 10 | name | 控制项名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 11 | ctldesc | 控制项指标 | ctldesc | varchar(200) |  | 备注 (Memo) |
| 12 | date_begin | 开始日期 | date_begin | char(19) |  | 日期(开始) (UFDateBegin) |
| 13 | date_end | 结束日期 | date_end | char(19) |  | 日期(结束) (UFDateEnd) |