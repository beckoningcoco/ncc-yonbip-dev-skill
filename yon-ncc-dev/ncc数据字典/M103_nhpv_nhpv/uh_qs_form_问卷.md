# |<<

**问卷 (uh_qs_form / com.yonyou.yh.nhis.pv.qs.qsform.vo.QsFormVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6248.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_form | 主键 | pk_form | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | form_type | 问卷分类 | form_type | varchar(20) |  | 字符串 (String) |
| 5 | eu_type | 业务类型 | eu_type | int |  | 整数 (Integer) |
| 6 | form_code | 问卷编码 | form_code | varchar(40) |  | 字符串 (String) |
| 7 | standard_code | 标准编码 | standard_code | varchar(40) |  | 字符串 (String) |
| 8 | form_name | 问卷名称 | form_name | varchar(80) |  | 字符串 (String) |
| 9 | page_size | 每页题目数量 | page_size | int |  | 整数 (Integer) |
| 10 | issue_flag | 是否发布 | issue_flag | varchar(1) |  | 字符串 (String) |
| 11 | memo | 备注 | memo | varchar(1000) |  | 字符串 (String) |
| 12 | page_header | 页眉 | page_header | varchar(4000) |  | 字符串 (String) |
| 13 | page_footer | 页脚 | page_footer | varchar(4000) |  | 字符串 (String) |
| 14 | form_class | 问卷类型 | form_class | int |  | 整数 (Integer) |
| 15 | flag_templet | 模板标志 | flag_templet | varchar(1) |  | 字符串 (String) |