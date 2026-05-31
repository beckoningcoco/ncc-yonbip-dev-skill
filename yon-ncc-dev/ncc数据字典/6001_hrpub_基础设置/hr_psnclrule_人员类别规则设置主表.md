# |<<

**人员类别规则设置主表 (hr_psnclrule / nc.vo.hr.psnclrule.PsnclruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2690.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnclrule | 设置主键 | pk_psnclrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_psncl | 人员类别 | pk_psncl | varchar(20) |  | 人员类别 (psncl) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | inheritflag | 继承上级人员类别的信息集配置 | inheritflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织 (org) |
| 6 | sourcepk | 继承来源 | sourcepk | varchar(20) |  | 字符串 (String) |