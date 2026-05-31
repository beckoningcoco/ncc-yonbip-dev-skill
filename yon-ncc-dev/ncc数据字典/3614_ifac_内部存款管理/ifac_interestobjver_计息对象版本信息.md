# |<<

**计息对象版本信息 (ifac_interestobjver / nc.vo.ifac.interestobj.InterestObjVerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3098.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intobj_v | 计息对象版本主键 | pk_intobj_v | char(20) | √ | 主键 (UFID) |
| 2 | pk_accintobj | 计息对象主键 | pk_accintobj | varchar(20) |  | 账户计息对象 (ifac_accinterestobj) |
| 3 | changedate | 变更日期 | changedate | char(19) |  | 日期 (UFDate) |
| 4 | operator | 更改人 | operator | varchar(20) |  | 用户 (user) |
| 5 | settledate | 结息日 | settledate | varchar(20) |  | 结息日 (fi_settledate) |
| 6 | pk_ratecode | 利率编码 | pk_ratecode | varchar(20) |  | 利率编码 (fi_ratecode) |
| 7 | floatingpercent | 浮动比例（%） | floatingpercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | version | 版本号 | version | varchar(10) |  | 字符串 (String) |
| 9 | intflag | 计息标志 | intflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | remark | 备注 | remark | varchar(181) |  | 字符串 (String) |
| 11 | effectivedate | 生效日期 | effectivedate | char(19) |  | 日期(开始) (UFDateBegin) |
| 12 | pk_account_g | 划入账户 | pk_account_g | varchar(20) |  | 内部账户 (bd_accid) |
| 13 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |