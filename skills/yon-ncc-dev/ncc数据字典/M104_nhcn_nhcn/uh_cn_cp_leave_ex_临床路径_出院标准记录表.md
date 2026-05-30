# |<<

**临床路径_出院标准记录表 (uh_cn_cp_leave_ex / com.yonyou.yh.nhis.cn.cp.vo.CpLeaveExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5972.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leave_ex | 主键 | pk_leave_ex | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_cp_ex | 路径记录表中的id | pk_cp_ex | varchar(20) | √ | 主键 (UFID) |
| 5 | pk_leave | 出院标准的id | pk_leave | varchar(20) | √ | 主键 (UFID) |