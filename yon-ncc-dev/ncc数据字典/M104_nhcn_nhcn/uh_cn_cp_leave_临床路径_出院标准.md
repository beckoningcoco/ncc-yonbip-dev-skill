# |<<

**临床路径_出院标准 (uh_cn_cp_leave / com.yonyou.yh.nhis.cn.cp.vo.CpLeaveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5971.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leave | 主键 | pk_leave | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | pk_cp | 对应的路径id | pk_cp | varchar(20) |  | 临床路径_基本信息表 (cncp) |
| 5 | desc_leave | 出院标准描述 | desc_leave | varchar(255) |  | 字符串 (String) |