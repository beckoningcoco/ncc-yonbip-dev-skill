# |<<

**输液室属性 (org_dept_uh_tf / com.yonyou.yh.nhis.bd.tf.vo.BdTfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4045.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tf | 所属输液室主键 | pk_tf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 座位编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 座位名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 7 | bgcolor | 背景颜色 | bgcolor | int |  | 整数 (Integer) |
| 8 | eu_placetype_def | 默认座椅属性 | eu_placetype_def | int |  | 输液座位属性 (TfSeatAttrEnum) |  | 0=普通; |