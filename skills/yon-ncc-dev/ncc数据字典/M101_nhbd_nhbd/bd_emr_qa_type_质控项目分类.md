# |<<

**质控项目分类 (bd_emr_qa_type / com.yonyou.yh.nhis.bd.qa.vo.EmrQaTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/823.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrqatype | 质控项目分类主键 | pk_emrqatype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 分类编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 分类名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | score | 所占分数 | score | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | flag_custome | 是否自定义分类 | flag_custome | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 9 | emr_temp_code | 医疗记录内部编码 | emr_temp_code | varchar(50) |  | 字符串 (String) |
| 10 | pk_parentqatype | 父质控分类 | pk_parentqatype | varchar(20) |  | 字符串 (String) |