# |<<

**人员教育培训 (hi_psndoc_train / nc.vo.hi.psndoc.TrainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2587.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | act_name | 培训活动名称 | act_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | begindate | 培训开始日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | enddate | 培训结束日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 5 | tra_type | 培训类别 | tra_type | varchar(20) | √ | 培训类型(自定义档案) (Defdoc-HR021_0xx) |
| 6 | tra_mode | 培训方式 | tra_mode | varchar(20) |  | 培训方式(自定义档案) (Defdoc-HR020_0xx) |
| 7 | traim | 培训目标 | traim | varchar(128) |  | 字符串 (String) |
| 8 | tra_content | 培训内容 | tra_content | varchar(1024) |  | 字符串 (String) |
| 9 | trm_location | 培训地点 | trm_location | varchar(128) |  | 字符串 (String) |
| 10 | tra_time | 培训学时 | tra_time | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | tra_result | 培训成绩 | tra_result | varchar(128) |  | 字符串 (String) |
| 12 | tra_cost | 培训费用 | tra_cost | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | contcode | 培训协议编号 | contcode | varchar(28) |  | 字符串 (String) |
| 14 | trm_certif_code | 培训证书编号 | trm_certif_code | varchar(128) |  | 字符串 (String) |
| 15 | trm_certif_name | 培训证书名称 | trm_certif_name | varchar(128) |  | 字符串 (String) |
| 16 | certificate_date | 获证日期 | certificate_date | char(10) |  | 模糊日期 (UFLiteralDate) |
| 17 | certificate_unit | 颁证单位 | certificate_unit | varchar(128) |  | 字符串 (String) |
| 18 | source_type | 参训来源 | source_type | int |  | 参训来源 (SourceType) |  | 0=指定参训; |