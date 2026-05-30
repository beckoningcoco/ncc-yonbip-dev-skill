# |<<

**人员类别信息集设置子表 (hr_psnclinfoset / nc.vo.hr.psnclrule.PsnclinfosetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2689.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnclinfoset | 主键 | pk_psnclinfoset | char(20) | √ | 主键 (UFID) |
| 2 | pk_psnclrule | 设置主键（主表） | pk_psnclrule | varchar(20) |  | 字符串 (String) |
| 3 | infotype | 信息类别 | infotype | int |  | 整数 (Integer) |
| 4 | infopk | 信息主键 | infopk | varchar(20) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 字符串 (String) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 字符串 (String) |
| 7 | metadata | 信息主键metadata | metadata | varchar(100) |  | 字符串 (String) |
| 8 | usedflag | 显示 | usedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | mustflag | 必输项 | mustflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | sysdataflag | 是否固定项 | sysdataflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | mustentryflag | 子集必录 | mustentryflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | showflag | 自助.显示 | showflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | caneditflag | 自助.可编辑 | caneditflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | checkflag | 自助.审核 | checkflag | char(1) |  | 布尔类型 (UFBoolean) |